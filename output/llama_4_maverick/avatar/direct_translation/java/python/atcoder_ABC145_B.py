
def cout(str):
    print(str)

def main():
    n = int(input())
    str = input()
    a = str[:n//2]
    if n % 2 == 0:
        if str == a + a:
            cout("Yes")
        else:
            cout("No")
    else:
        if str == a + a[0] + a:
            cout("Yes")
        else:
            cout("No")

if __name__ == "__main__":
    main()

