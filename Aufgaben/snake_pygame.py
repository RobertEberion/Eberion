import pygame
import random

pygame.init()  # initializiert pygames

WIN_SIZE = 800
SQUARE_COUNT = 20
SQUARE_SIZE = WIN_SIZE // SQUARE_COUNT
DELAY = 100

screen = pygame.display.set_mode((WIN_SIZE, WIN_SIZE))  #Bildschirmgröße
pygame.display.set_caption("Snake")

head_column = SQUARE_COUNT // 2  #Startposition des Kopfes
head_row = SQUARE_COUNT // 2
snake_length = 5
body_parts = []
step_x = 0
step_y = 0

run = True
while run:
  pygame.time.delay(DELAY)  #Millisekunden warten

  for event in pygame.event.get():  #alle Events abfragen
    if event.type == pygame.QUIT:  #Event ist das Schließen des Fensters
      run = False  #Schleife beenden

  keys = pygame.key.get_pressed()  #Tasten abfragen
  if keys[pygame.K_RIGHT]:
    if step_x != -1:
      step_x = 1
      step_y = 0
  elif keys[pygame.K_LEFT]:
    if step_x != 1:
      step_x = -1
      step_y = 0
  elif keys[pygame.K_UP]:
    if step_y != 1:
      step_x = 0
      step_y = -1
  elif keys[pygame.K_DOWN]:
    if step_y != -1:
      step_x = 0
      step_y = 1

  if step_x != 0 or step_y != 0:
    body_parts.append((head_column, head_row))
    if len(body_parts) >= snake_length:
      body_parts.pop(0)

  head_column += step_x
  head_row += step_y

  if (head_column, head_row) in body_parts:
    head_column = SQUARE_COUNT // 2
    head_row = SQUARE_COUNT // 2
    snake_length = 5
    body_parts = []
    step_x = 0
    step_y = 0

  screen.fill((0, 0, 0))  #Hintergrundfarbe

  head_x = head_column * SQUARE_SIZE
  head_y = head_row * SQUARE_SIZE
  pygame.draw.rect(
      screen, (0, 255, 0),
      (head_x, head_y, SQUARE_SIZE, SQUARE_SIZE))  #Rechteck zeichnen

  for part in body_parts:
    part_column = part[0]
    part_row = part[1]
    part_x = part_column * SQUARE_SIZE
    part_y = part_row * SQUARE_SIZE
    pygame.draw.rect(screen, (0, 255, 0),
                     (part_x, part_y, SQUARE_SIZE, SQUARE_SIZE))

  for i in range(SQUARE_COUNT):
    line_pos = i * SQUARE_SIZE
    pygame.draw.line(screen, (173, 216, 230), (line_pos, 0),
                     (line_pos, WIN_SIZE), 2)
    pygame.draw.line(screen, (173, 216, 230), (0, line_pos),
                     (WIN_SIZE, line_pos), 2)

  pygame.display.update()

pygame.display.quit()
