
def area(w, h):
    return w * h

arr = list(map(int, input().split()))[:4]
a1 = area(arr[0], arr[1])
a2 = area(arr[2], arr[3])
print(max(a1, a2))

