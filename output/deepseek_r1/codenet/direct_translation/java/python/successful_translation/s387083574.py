n = int(input())
values = list(map(int, input().split()))
d = {i+1: values[i] for i in range(n)}
sorted_keys = [str(k) for k, _ in sorted(d.items(), key=lambda x: x[1])]
print(' '.join(sorted_keys))
