
import sys

def main():
    import sys
    import sys
    from sys import stdin
    
    sc = sys.stdin
    N = int(sc.readline().strip())
    count1 = 0
    count2 = 0
    for i in range(N):
        a = int(sc.readline().strip())
        if a % 4 == 0:
            count1 += 1
        elif a % 2 == 0 and (a // 2) % 2 == 1:
            count2 += 1
    if count1 >= N // 2:
        print("Yes")
    elif ((N // 2 - count1) * 2 + N % 2) == count2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

