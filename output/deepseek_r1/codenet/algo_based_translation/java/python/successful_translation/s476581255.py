
def bubble_sort(a):
    count = 0
    flag = True
    while flag:
        flag = False
        for j in range(len(a)-1, 0, -1):
            if a[j] < a[j-1]:
                a[j], a[j-1] = a[j-1], a[j]
                count += 1
                flag = True
    return count

if __name__ == "__main__":
    n = int(input())
    a = list(map(int, input().split()))[:n]
    count = bubble_sort(a)
    print(' '.join(map(str, a)))
    print(count)

