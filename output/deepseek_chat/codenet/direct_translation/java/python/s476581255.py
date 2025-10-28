
def main():
    n = int(input())
    a = [int(input()) for _ in range(n)]
    count = bubble_sort(a, n)
    print(' '.join(map(str, a)))
    print(count)

def bubble_sort(a, n):
    flag = True
    count = 0
    while flag:
        flag = False
        for j in range(n-1, 0, -1):
            if a[j] < a[j-1]:
                a[j], a[j-1] = a[j-1], a[j]
                count += 1
                flag = True
    return count

if __name__ == "__main__":
    main()

