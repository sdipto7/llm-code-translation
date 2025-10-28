
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    pandu = int(input[0])
    vundu = int(input[1])
    urdu = int(input[2])
    c = 0
    for i in range(1, urdu + 1):
        c += i * pandu
    if c < vundu:
        print("0")
    else:
        print(c - vundu)

if __name__ == "__main__":
    main()

