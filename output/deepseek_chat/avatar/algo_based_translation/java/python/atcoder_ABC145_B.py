
import sys

def cout(str):
    print(str)

def main():
    n = int(input().strip())
    s = input().strip()
    a = ""
    for i in range(n // 2):
        a += s[i]
    if s == a + a:
        cout("Yes")
    else:
        cout("No")

if __name__ == "__main__":
    main()

