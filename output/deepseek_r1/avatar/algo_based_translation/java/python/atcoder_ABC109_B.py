
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        print("No")
        return
    N = int(data[0])
    if len(data) < N + 1:
        print("No")
        return
    words = data[1:N+1]
    seen = set()
    ans = True
    last_char = ''
    for i in range(N):
        current = words[i]
        if current in seen:
            ans = False
            break
        seen.add(current)
        if i > 0:
            if current[0] != last_char:
                ans = False
                break
        last_char = current[-1]
    print("Yes" if ans else "No")

if __name__ == "__main__":
    main()

