S = input().strip()
score = 0
for i in range(len(S)):
    my = 'g' if i % 2 == 0 else 'p'
    current = S[i]
    if my != current:
        score += 1 if my == 'p' else -1
print(score)
