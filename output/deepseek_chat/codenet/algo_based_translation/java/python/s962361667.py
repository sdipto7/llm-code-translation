
import sys

def main():
    w = int(input())
    n = int(input())
    values = [0] * w
    for i in range(w):
        values[i] = i + 1
    for i in range(n):
        x = 0
        str_input = input()
        ab = str_input.split(",")
        a = int(ab[0]) - 1
        b = int(ab[1]) - 1
        x = values[a]
        values[a] = values[b]
        values[b] = x
    for i in range(w):
        print(values[i])

if __name__ == "__main__":
    main()

