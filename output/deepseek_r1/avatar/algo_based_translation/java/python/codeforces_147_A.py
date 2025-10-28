
def is_latin(c):
    return 'a' <= c <= 'z'

def is_punct(c):
    return c in {'.', ',', '!', '?'}

s = input()
sb = [s[0]] if s else []
for i in range(1, len(s)):
    c = s[i]
    if is_latin(c):
        if not is_latin(s[i-1]):
            sb.append(' ')
        sb.append(c)
    elif is_punct(c):
        sb.append(c)
print(''.join(sb))

