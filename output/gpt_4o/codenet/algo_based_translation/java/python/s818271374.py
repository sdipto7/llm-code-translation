
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    count1 = 0
    count2 = 0
    
    for i in range(1, N + 1):
        a = int(data[i])
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

