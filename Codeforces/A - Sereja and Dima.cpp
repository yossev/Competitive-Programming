#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    int n;
    std::cin >> n;

    std::vector<int> cards(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> cards[i];
    }

    int sereja_score = 0, dima_score = 0;
    int left = 0, right = n - 1;
    bool sereja_turn = true;

    while (left <= right) {
        int chosen_card;
        if (cards[left] > cards[right]) {
            chosen_card = cards[left++];
        } else {
            chosen_card = cards[right--];
        }

        if (sereja_turn) {
            sereja_score += chosen_card;
        } else {
            dima_score += chosen_card;
        }

        sereja_turn = !sereja_turn;
    }

    std::cout << sereja_score << " " << dima_score << std::endl;

    return 0;
}
