import sys

def main():
    import sys
    x = int(sys.stdin.readline().strip())
    bool_val = True if x == 1 else False
    result = 1 if not bool_val else 0
    print(result)

if __name__ == "__main__":
    main()
