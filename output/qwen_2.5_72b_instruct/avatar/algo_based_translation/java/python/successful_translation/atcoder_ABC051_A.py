
def main():
    import sys
    import io

    sys.stdin = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    a = input()
    modified_string = a.replace(',', ' ')
    print(modified_string)

if __name__ == "__main__":
    main()

