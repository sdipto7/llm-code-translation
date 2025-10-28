import sys

def cout(str):
    print(str)

def main():
    import sys
    cin = sys.stdin.read().split()
    n = int(cin[0])
    str = cin[1]
    a = ""
    for i in range(n // 2):
        a += str[i]
    if str == a + a:
        cout("Yes")
    else:
        cout("No")

main()
