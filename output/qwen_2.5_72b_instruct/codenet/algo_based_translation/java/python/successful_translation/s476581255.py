import sys

def bubble_sort(a, n):
    flag = True
    count = 0
    while flag:
        flag = False
        for j in range(n-1, 0, -1):
            if a[j] < a[j-1]:
                free = a[j]
                a[j] = a[j-1]
                a[j-1] = free
                count += 1
                flag = True
    return count

def main():
    import sys
    import sys
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))
    count = bubble_sort(a, n)
    for i in range(n):
        if i < n-1:
            print(a[i], end=" ")
        else:
            print(a[i])
    print(count)

if __name__ == "__main__":
    main()
