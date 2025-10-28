
import sys
import threading

def main():
    import sys
    from collections import deque
    
    class FastReader:
        def __init__(self):
            self.br = sys.stdin
            self.st = None
        
        def next(self):
            while self.st is None or not self.st:
                try:
                    self.st = deque(self.br.readline().split())
                except:
                    pass
            return self.st.popleft()
        
        def nextInt(self):
            return int(self.next())
        
        def nextLong(self):
            return int(self.next())
        
        def nextDouble(self):
            return float(self.next())
        
        def nextLine(self):
            s = ""
            while self.st is None or not self.st:
                try:
                    s = self.br.readline()
                except:
                    pass
            return s
    
    in_reader = FastReader()
    n = in_reader.nextInt()
    left = set(range(n))
    answer = [0] * n
    
    q = in_reader.nextInt()
    for _ in range(q):
        l = in_reader.nextInt() - 1
        r = in_reader.nextInt() - 1
        win = in_reader.nextInt()
        
        to_remove = []
        for idx in sorted(left):
            if l <= idx <= r:
                answer[idx] = win
                to_remove.append(idx)
        
        for idx in to_remove:
            left.discard(idx)
        
        answer[win - 1] = 0
        left.add(win - 1)
    
    ans_str = " ".join(map(str, answer))
    print(ans_str)

threading.Thread(target=main).start()

