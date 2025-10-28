
def main():
    a = int(input())
    b = input().strip()
    b_str = ""
    for c in b:
        if c != '.':
            b_str += c
    b_int = int(b_str)
    result = (a * b_int) // 100
    print(result)

if __name__ == "__main__":
    main()

