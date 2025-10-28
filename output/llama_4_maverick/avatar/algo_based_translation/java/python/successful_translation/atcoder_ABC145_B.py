
def main():
    n = int(input())
    str = input()
    a = ""
    for i in range(n // 2):
        a += str[i]
    if n % 2 == 0 and str == a + a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

