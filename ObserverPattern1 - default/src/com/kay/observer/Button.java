package com.kay.observer;

public class Button {

	// notify
	public void onClick() {
		// 이벤트 처리
		if (onClickListener != null)
			onClickListener.onClick(this);
	}

	// update
	public interface OnClickListener {
		public void onClick(Button button);
	}

	private OnClickListener onClickListener;

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
}
