/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void merge(int* a, int lb, int mid, int ub) {
    int i = lb;
    int j = mid + 1;
    int k = 0;
    int* b = (int*)malloc((ub - lb + 1) * sizeof(int));

    while (i <= mid && j <= ub) {
        if (a[i] <= a[j]) {
            b[k++] = a[i++];
        } else {
            b[k++] = a[j++];
        }
    }

    while (i <= mid) {
        b[k++] = a[i++];
    }

    while (j <= ub) {
        b[k++] = a[j++];
    }

    for (i = lb, k = 0; i <= ub; i++, k++) {
        a[i] = b[k];
    }

    free(b);
}

void ms(int* nums, int lb, int ub) {
    if (lb < ub) {
        int mid = (lb + ub) / 2;
        ms(nums, lb, mid);
        ms(nums, mid + 1, ub);
        merge(nums, lb, mid, ub);
    }
}

int* sortArray(int* nums, int n, int* returnSize) {
    int lb = 0;
    int ub = n - 1;
    ms(nums, lb, ub);
    *returnSize = n;
    return nums;
}
