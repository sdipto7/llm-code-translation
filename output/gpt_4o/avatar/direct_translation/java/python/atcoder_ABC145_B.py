
def cout(str):
    print(str)

def main():
    import sys
    input = sys.stdin.readline
    n = int(input().strip())
    str = input().strip()
    a = ""
    for i in range(n // 2):
        a += str[i]
    if str == a + a:
        cout("Yes")
    else:
        cout("No")

if __name__ == "__main__":
    main()

