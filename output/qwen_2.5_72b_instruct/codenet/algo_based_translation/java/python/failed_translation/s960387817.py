
import sys

def main():
    import sys
    from collections import HashSet

    n = int(sys.stdin.readline().strip())
    set = set()
    for i in range(n):
        set.add(int(sys.stdin.readline().strip()))
    print(len(set))

if __name__ == "__main__":
    main()

