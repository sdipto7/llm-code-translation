import sys

def log(str):
    print(str)

def main():
    import sys
    input = sys.stdin.read().split()
    A = int(input[0])
    B = int(input[1])
    T = int(input[2])
    result = (T // A) * B
    log(result)

if __name__ == "__main__":
    main()
