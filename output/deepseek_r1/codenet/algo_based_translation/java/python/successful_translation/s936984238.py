
import sys

tokens = list(map(int, sys.stdin.read().split()))
ptr = 0
number = 0
score = []

def read():
    global ptr, number, score
    if ptr >= len(tokens):
        return False
    number = tokens[ptr]
    ptr += 1
    if number == 0:
        return False
    score = tokens[ptr:ptr + number]
    ptr += number
    return True

def solve():
    global score, number
    sorted_scores = sorted(score)
    total = sum(sorted_scores[1:-1])
    print(total // (number - 2))

def main():
    while True:
        if not read():
            break
        solve()

if __name__ == "__main__":
    main()

