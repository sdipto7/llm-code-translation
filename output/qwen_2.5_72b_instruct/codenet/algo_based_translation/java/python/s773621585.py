
from collections import defaultdict

def main():
    map = defaultdict(str)
    n = int(input())
    input()  # discard the next line
    for i in range(n):
        key = input()
        map[key] = ""
    print(len(map))

if __name__ == "__main__":
    main()

