
import sys

def main():
    try:
        n = int(sys.stdin.readline().strip())
        if n == 1:
            print("Hello World")
        else:
            a = int(sys.stdin.readline().strip())
            b = int(sys.stdin.readline().strip())
            print(a + b)
    except Exception as e:
        pass
    finally:
        sys.stdin.close()

if __name__ == "__main__":
    main()

