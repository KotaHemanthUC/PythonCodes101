import numpy as np

def check_answer(guess, a_followers, b_followers):
    if a_followers > b_followers:
        return guess == 'a'
    else:
        return guess == 'b'

def game():
    a = np.random.randint(1000)
    b = np.random.randint(1000)
    print("Value of a: ", a, ", b:", b)
    while a == b:
        b = np.random.randint(1000)
    guess = input("Which Is Bigger Number? 'A' or 'B': ").lower()
    is_correct = check_answer(guess, a, b)
    return is_correct

inp = True
score = 0
while inp:
    score_state = game()
    if score_state :
        score = score+1
        print("You Guessed it Correct! current score: ",score)
    else:
        print("Sorry. That's wrong. final score: ", score)
        continue