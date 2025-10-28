import sys

def main():
    N = int(input().strip())
    s = input().strip()
    c = list(s)
    for i in range(len(c)):
        c[i] = chr((ord(c[i]) - ord('A') + N) % 26 + ord('A'))
    print(''.join(c))

if __name__ == "__main__":
    main()
