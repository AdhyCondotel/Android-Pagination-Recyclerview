package com.suleiman.pagination;

import com.suleiman.pagination.models.ResponseGetList;

public interface chaView {
    void handleSuccess(ResponseGetList responseAuth);
    void handleError(Throwable throwable);
}
