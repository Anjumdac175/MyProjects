using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace StudentEFC.Models;

public partial class Actsjune25Context : DbContext
{
    public Actsjune25Context()
    {
    }

    public Actsjune25Context(DbContextOptions<Actsjune25Context> options)
        : base(options)
    {
    }

    public virtual DbSet<Book> Books { get; set; }

    public virtual DbSet<Department> Departments { get; set; }

    public virtual DbSet<Employee> Employees { get; set; }

    public virtual DbSet<Publisher> Publishers { get; set; }

    public virtual DbSet<Student> Students { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=ACTSJUNE25;Integrated Security=true");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Book>(entity =>
        {
            entity.HasKey(e => e.BookId).HasName("PK__Books__3DE0C20777CED605");

            entity.Property(e => e.Author)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Price).HasColumnType("decimal(10, 2)");
            entity.Property(e => e.Title)
                .HasMaxLength(50)
                .IsUnicode(false);

            entity.HasOne(d => d.Publisher).WithMany(p => p.Books)
                .HasForeignKey(d => d.PublisherId)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("FK_Books_ToPublishers");
        });

        modelBuilder.Entity<Department>(entity =>
        {
            entity.HasKey(e => e.DeptNo).HasName("PK__Departme__0148CAAE9B057EBB");

            entity.Property(e => e.DeptNo).ValueGeneratedNever();
            entity.Property(e => e.DeptName)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Employee>(entity =>
        {
            entity.HasKey(e => e.EmpNo).HasName("PK__Employee__AFB335924F94DD7B");

            entity.Property(e => e.EmpNo)
                .ValueGeneratedNever()
                .HasColumnName("empNo");
            entity.Property(e => e.Basic).HasColumnType("decimal(18, 2)");
            entity.Property(e => e.EmpName)
                .HasMaxLength(10)
                .IsFixedLength()
                .HasColumnName("empName");

            entity.HasOne(d => d.DeptNoNavigation).WithMany(p => p.Employees)
                .HasForeignKey(d => d.DeptNo)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("FK_Employees_Departments");
        });

        modelBuilder.Entity<Publisher>(entity =>
        {
            entity.HasKey(e => e.PublisherId).HasName("PK__Publishe__4C657FAB357CC689");

            entity.Property(e => e.PublisherName)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Student>(entity =>
        {
            entity.HasKey(e => e.RollNo).HasName("PK__Student__7886D5A009565C1C");

            entity.ToTable("Student");

            entity.Property(e => e.RollNo).ValueGeneratedNever();
            entity.Property(e => e.Email)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
