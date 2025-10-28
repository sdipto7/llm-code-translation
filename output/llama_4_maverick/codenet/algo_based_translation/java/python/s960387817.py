
import sys

def main():
    try:
        n = int(sys.stdin.readline().strip())
        unique_nums = set()
        for _ in range(n):
            unique_nums.add(int(sys.stdin.readline().strip()))
        print(len(unique_nums))
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

