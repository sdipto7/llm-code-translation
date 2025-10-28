
def solve():
    s = input().strip().lower()
    vowels = {'a', 'e', 'i', 'o', 'u'}
    print('vowel' if s in vowels else 'consonant')

if __name__ == "__main__":
    solve()

