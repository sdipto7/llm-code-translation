
n = int(input())
taro_score = 0
hana_score = 0

for _ in range(n):
    taro, hana = input().split()
    if taro < hana:
        hana_score += 3
    elif taro == hana:
        taro_score += 1
        hana_score += 1
    else:
        taro_score += 3

print(f"{taro_score} {hana_score}")

