<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layouts/header.jsp" %>
<%@ include file="layouts/topsidebar.jsp" %>
		<div class="col-md-12 title">
				<h1>CƠ HỘI VIỆT LÀM</h1>
				<h3>Tham gia đội ngũ Mắt Việt ngay hôm nay</h3>
		</div>
		<div class="col-md-12 products">
			<section class="table-responsive"> <c:forEach
				items="${recruitments}" var="recruitment">
				<c:url var="detailUrl" value="/showDetailProduct">
					<c:param name="productId" value="${recruitment.id}" />
				</c:url>
				<div class="col-md-3 product">
					<div class="card">
						<img class="card-img-top" src="${recruitment.img}"
							alt="Card image cap" style="width: 100%; min-height: 230px;">
						<div class="card-body">
							<h5 class="card-title">
								<c:out value="${recruitment.title}" />
							</h5>
							<a href="${detailUrl}" class="btn btn-add-to-cart">Chi tiết</a>
						</div>
					</div>
				</div>

			</c:forEach> </section>
		</div>
	</div>
</body>
<%@ include file="layouts/footer.jsp" %>
</html>
