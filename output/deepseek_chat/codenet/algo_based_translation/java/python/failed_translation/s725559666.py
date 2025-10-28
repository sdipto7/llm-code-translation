def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a < b and b < c and a < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
