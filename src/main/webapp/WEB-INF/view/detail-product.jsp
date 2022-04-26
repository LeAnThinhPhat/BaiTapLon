<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layouts/header.jsp" %>
<%@ include file="layouts/topsidebar.jsp" %>
<style>
	.slide{
		display:none;
	}
</style>
		<div class="col-md-12 detail-product">
			<form:form items="${product}" var="product">
				<c:url var="detailUrl" value="/showDetailProduct">
					<c:param name="productId" value="${product.id}" />
				</c:url>
				<div class="col-md-12" style="padding-bottom: 3rem; display: flex;">
					<div class="card" style="width: 100%;">
						<div class="col-md-7">
							<img class="card-img-top" src="${product.image}"
								alt="Card image cap" style="width: 50%; border-radius: 10px">
						</div>
						<div class="col-md-5">
							<div class="card-body">
								<h2 class="card-title">
									<c:out value="${product.name}" />
								</h2>
								<h3 class="card-text" style="color:#0094b2;">
									Giá: 
									<c:out value="${product.price}" /> VNĐ
								</h3>
								<h4 class="card-text">
									Chủng loại:
									<c:out value="${product.type}" />
								</h4>
								<h4 class="card-text">
									Dành cho:
									<c:out value="${product.sex}" />
								</h4>
								<h4 class="card-text">
									Màu gọng:
									<c:out value="${product.color}" />
								</h4>

								<h4 class="card-text">
									Kiểu dáng kinh:
									<c:out value="${product.shape}" />
								</h4>
								<h4 class="card-text">
									Chất liệu:
									<c:out value="${product.material}" />
								</h4>
								<input type="text" name="addCart" style="width: 50px; border-radius: 5px; padding-left:5px;"/> 
								<a href="${detailUrl}" class="btn btn-add-to-cart">Thêm vào giỏ hàng</a>
							</div>
						</div>
					</div>

				</div>

			</form:form>
		</div>
	</div>
</body>
<%@ include file="layouts/footer.jsp" %>
</html>