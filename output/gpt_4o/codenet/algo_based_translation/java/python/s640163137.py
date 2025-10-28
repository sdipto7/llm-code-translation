
import sys

def sort_and_count_swaps():
    input = sys.stdin.read
    data = input().splitlines()
    
    n = int(data[0])
    a = list(map(int, data[1].split()))
    
    swap_count = 0

    for i in range(len(a)):
        mini = i
        for j in range(i, len(a)):
            if a[j] < a[mini]:
                mini = j
        
        if mini != i:
            v = a[mini]
            a[mini] = a[i]
            a[i] = v
            swap_count += 1

    ans = str(a[0])
    for i in range(1, len(a)):
        ans += " " + str(a[i])

    print(ans)
    print(swap_count)

if __name__ == "__main__":
    sort_and_count_swaps()

