
import sys

def main():
    str_input = input().strip()
    c = list(str_input)
    k = int(input().strip())
    n = len(str_input)
    for i in range(k):
        if c[i] == '1':
            if i == k - 1:
                print(1)
                return
        else:
            print(c[i])
            return

if __name__ == "__main__":
    main()

