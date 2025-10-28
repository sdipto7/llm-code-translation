
import sys

def main():
    import sys
    abc = [0] * 3
    str_input = sys.stdin.readline().strip()
    inp = str_input.split(' ')
    for i in range(len(inp)):
        abc[i] = int(inp[i])
    if abc[0] < abc[1] and abc[1] < abc[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

