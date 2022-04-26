<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layouts/header.jsp" %>
<%@ include file="layouts/topsidebar.jsp" %>
		<div class="col-md-12  title">
				<h1>SẢN PHẨM</h1>
		</div>
		<div class="col-md-12 products">
			<section class="table-responsive"> 
				<c:forEach items="${products}" var="product">
					<c:url var="detailUrl" value="/showDetailProduct">
						<c:param name="productId" value="${product.id}" />
					</c:url>
					<div class="col-md-3 product">
						<div class="card" >
							<img class="card-img-top" src="${product.image}"
								alt="" style="width: 100%">
							<div class="card-body">
								<h5 class="card-title">
									<c:out value="${product.name}" />
								</h5>
								<p class="card-text">
									<c:out value="${product.price}" /> VNĐ
								</p>
								<a href="${detailUrl}" class="btn btn-add-to-cart">Chi tiết</a>
							</div>
						</div>
					</div>
				</c:forEach> 
			</section>
		</div>
	</div>
</body>
<%@ include file="layouts/footer.jsp" %>

