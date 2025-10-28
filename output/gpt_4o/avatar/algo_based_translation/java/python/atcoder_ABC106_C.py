
import sys

def main():
    sc = sys.stdin
    str_input = sc.readline().strip()
    c = list(str_input)
    k = int(sc.readline().strip())
    n = len(str_input)

    for i in range(min(k, n)):
        if c[i] == '1':
            if i == k - 1:
                print(1)
                return
        else:
            print(c[i])
            return

if __name__ == "__main__":
    main()

