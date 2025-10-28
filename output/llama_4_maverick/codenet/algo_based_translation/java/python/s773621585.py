
from collections import defaultdict

def main():
    map = {}
    n = int(input())
    input() # Consume the empty line
    for _ in range(n):
        map[input()] = ""
    print(len(map))

if __name__ == "__main__":
    main()

