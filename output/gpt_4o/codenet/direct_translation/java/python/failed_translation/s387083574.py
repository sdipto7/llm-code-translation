
N = int(input())
map_dict = {i: int(input()) for i in range(1, N + 1)}
sorted_keys = sorted(map_dict, key=map_dict.get)
print(' '.join(map(str, sorted_keys)))

