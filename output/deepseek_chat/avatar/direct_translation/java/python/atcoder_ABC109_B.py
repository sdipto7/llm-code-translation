N = int(input())
map_dict = {}
for i in range(N):
    map_dict[i] = input()

ans = True
past_dict = {}
next_char = ""
for i in range(N):
    if map_dict[i] in past_dict.values():
        ans = False
        break
    past_dict[i] = map_dict[i]
    if i != 0:
        if next_char != map_dict[i][0]:
            ans = False
            break
    next_char = map_dict[i][-1]

if ans:
    print("Yes")
else:
    print("No")
