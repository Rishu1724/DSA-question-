import sys
from collections import deque

def solve():
    # Fast I/O to handle large test cases without timing out
    input_data = sys.stdin.read().split()
    if not input_data:
        return

    n = int(input_data[0])
    m = int(input_data[1])
    b = int(input_data[2])
    e = int(input_data[3])

    # Extract vault requirements (v) and ravager skill levels (r)
    v = [int(x) for x in input_data[4 : 4 + n]]
    r = [int(x) for x in input_data[4 + n : 4 + n + m]]

    v.sort()
    r.sort()

    def can(k):
        dq = deque()
        j = m - 1
        pills = b

        # Process the k smallest vaults in descending order of difficulty
        for i in range(k - 1, -1, -1):
            # Push all ravagers among the top k who can beat vault i WITH a booster
            while j >= m - k and r[j] + e >= v[i]:
                dq.appendleft(r[j])
                j -= 1

            if not dq:
                return False

            # Greedy check: use largest skill without booster if possible
            if dq[-1] >= v[i]:
                dq.pop()
            else:
                # Otherwise, consume a booster on the weakest eligible ravager
                if pills == 0:
                    return False
                pills -= 1
                dq.popleft()

        return True

    # Binary search for the maximum number of vaults
    lo, hi = 0, min(n, m)

    while lo < hi:
        mid = (lo + hi + 1) // 2
        if can(mid):
            lo = mid
        else:
            hi = mid - 1

    print(lo)

if __name__ == '__main__':
    solve()