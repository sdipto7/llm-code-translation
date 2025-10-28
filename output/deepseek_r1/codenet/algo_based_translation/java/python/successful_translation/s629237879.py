
import sys

def main():
    n = int(sys.stdin.readline())
    cards = [sys.stdin.readline().rstrip('\n') for _ in range(n)]
    marks = ['S', 'H', 'C', 'D']
    for mark in marks:
        for num in range(1, 14):
            card = f"{mark} {num}"
            if card not in cards:
                print(card)

if __name__ == "__main__":
    main()

