<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layouts/header.jsp" %>
<%@ include file="layouts/topsidebar.jsp" %>		
		<div class="col-md-12" style="padding-bottom: 4rem; padding-top: 4rem;">
			<section class="table-responsive"> 
			<c:forEach
				items="${discounts}" var="discount" >
				<c:url var="detailUrl" value="/showDetailProduct">
					<c:param name="productId" value="${discount.id}" />
				</c:url>
				<div class="col-md-12"
					style="padding-bottom: 3rem; padding-top: 3rem; background-color: grey; border-radius: 10px">
					<div class="card" style="width: 100%;">
						<div class="col-md-7">
							<img class="card-img-top" src="${discount.img}"
								alt="Card image cap" style="width: 100%">
						</div>
						<div class="col-md-5">
							<div class="card-body">
								<h2 class="card-title">
									<c:out value="${discount.title}" />
								</h2>
								<p class="card-text">
									<c:out value="${discount.description}" />
								</p>
								<a href="${detailUrl}" class="btn btn-add-to-cart">Xem chi tiết</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach> 
			</section>
		</div>
	</div>
</body>
<%@ include file="layouts/footer.jsp" %>
</html>
