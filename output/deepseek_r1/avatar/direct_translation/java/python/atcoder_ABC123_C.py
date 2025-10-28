N = int(input())
cities = [int(input()) for _ in range(5)]
min_city = min(cities)
print((N + min_city - 1) // min_city + 4)
