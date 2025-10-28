
import sys

def main():
    x = int(sys.stdin.readline().strip())
    bool_value = (x == 1)
    result = 1 if not bool_value else 0
    print(result)

if __name__ == "__main__":
    main()

