
N = int(input())
map = {}
for i in range(1, N + 1):
    map[i] = int(input())
print(' '.join(str(key) for key, value in sorted(map.items(), key=lambda item: item[1])))

